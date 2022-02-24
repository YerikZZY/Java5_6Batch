package day2;

import java.nio.file.Path;

public class Criteria {

    Path folderPath;
    boolean includeSubFolder;
    long fileCount;

    public Criteria() {
    }

    public Criteria(Path folderPath, boolean includeSubFolder, int fileCount) {
        this.folderPath = folderPath;
        this.includeSubFolder = includeSubFolder;
        this.fileCount = fileCount;
    }

    public Path getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(Path folderPath) {
        this.folderPath = folderPath;
    }

    public boolean isIncludeSubFolder() {
        return includeSubFolder;
    }

    public void setIncludeSubFolder(boolean includeSubFolder) {
        this.includeSubFolder = includeSubFolder;
    }

    public long getFileCount() {
        return fileCount;
    }

    public void setFileCount(long fileCount) {
        this.fileCount = fileCount;
    }
}
