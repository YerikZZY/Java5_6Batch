package day2;

import java.nio.file.Path;

public class Criteria {

    private Path folderPath;
    private boolean includeSubFolder;
    private String extensionString;
    private long folderCount;
    private long fileCount;
    private long extensionCount;


    public Criteria(Path folderPath, boolean includeSubFolder, String extensionString) {
        this.folderPath = folderPath;
        this.includeSubFolder = includeSubFolder;
        this.extensionString = extensionString;
        this.folderCount = 0;
        this.fileCount = 0;
        this.extensionCount = 0;
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

    public String getExtensionString() {
        return extensionString;
    }

    public void setExtensionString(String extensionString) {
        this.extensionString = extensionString;
    }

    public long getFolderCount() {
        return folderCount;
    }

    public void setFolderCount(long folderCount) {
        this.folderCount = folderCount;
    }

    public long getFileCount() {
        return fileCount;
    }

    public void setFileCount(long fileCount) {
        this.fileCount = fileCount;
    }

    public long getExtensionCount() {
        return extensionCount;
    }

    public void setExtensionCount(long extensionCount) {
        this.extensionCount = extensionCount;
    }
}
