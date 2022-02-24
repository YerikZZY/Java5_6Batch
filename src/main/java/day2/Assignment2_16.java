package day2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2_16 {

    private static long count(Criteria criteria) throws IOException {
        long count=0;
        List<Path> files = Files.list(criteria.folderPath).collect(Collectors.toList());
        for(Path p : files) {
            boolean isFolder = !(new File(String.valueOf(p)).isFile());
            if(isFolder) {
                count += count(new Criteria(p, true, 0));
            }
            count++;
        }
        criteria.setFileCount(count);

        return count;
    }

    public static void main(String[] args) {
        String pathString = args[0];
        Criteria criteria = new Criteria();
        criteria.setFolderPath(Paths.get(pathString));
        long res = 0;
        try {
            res = count(criteria);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }

}
