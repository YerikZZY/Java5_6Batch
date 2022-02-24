package day2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2_16 {

    private static Criteria count(Criteria criteria) throws IOException {
        if(!criteria.isIncludeSubFolder()) {
            String[] extension = new File(String.valueOf(criteria.getFolderPath())).getName().split("\\.");
            if(criteria.getExtensionString().equals(extension[extension.length-1])) {
                criteria.setExtensionCount(1);
            }
            criteria.setFileCount(1);
            return criteria;
        }
        long folderCount=1;
        long fileCount=0;
        long extensionCount=0;
        List<Path> files = Files.list(criteria.getFolderPath()).collect(Collectors.toList());
        for(Path p : files) {
            Criteria c = new Criteria(p, !(new File(String.valueOf(p)).isFile()), criteria.getExtensionString());
            folderCount += count(c).getFolderCount();
            fileCount += count(c).getFileCount();
            extensionCount += count(c).getExtensionCount();
        }
        criteria.setFolderCount(folderCount);
        criteria.setFileCount(fileCount);
        criteria.setExtensionCount(extensionCount);

        return criteria;
    }

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("wrong input");
            return;
        }
        String pathString = args[0];
        String extensionString = args[1];
        Path path = Paths.get(pathString);
        Criteria criteria = null;
        try {
            criteria = count(
                    new Criteria(
                        path,
                        !(new File(String.valueOf(path)).isFile()),
                        extensionString
                    )
                );
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(criteria == null) {
            System.out.println("wrong input");
            return;
        }
        try {
            System.out.println("There are");
            System.out.println(count(criteria).getFolderCount() + " Folders");
            System.out.println(count(criteria).getFileCount() + " Files");
            System.out.println(count(criteria).getExtensionCount() + " Extensions");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
