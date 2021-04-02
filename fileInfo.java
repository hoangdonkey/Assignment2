public class fileInfo {
    private String path;

    public fileInfo(String path) {
        this.path = path;
    }

    public String getPath() {
        if (path == null || "".equals(path)) {
            return "";
        }

        int lastIndex = path.lastIndexOf('\\');

        return path.substring(0, lastIndex);
    }

    public String getFileName() {
        if (path == null || "".equals(path)) {
            return "";
        }

        int lastIndex = path.lastIndexOf('\\');
        int indexOfDot = path.lastIndexOf('.');

        //System.out.println("LastINdex: " + lastIndex);
        //System.out.println("dot: " + indexOfDot);
        if (lastIndex != -1 && indexOfDot != -1) {
            return path.substring(lastIndex + 1, indexOfDot);
        }

        return "";
    }

    public String getExtension() {

        if (path == null || "".equals(path)) {
            return "";
        }

        int indexOfDot = path.lastIndexOf('.');
        if (indexOfDot != -1) {
            return path.substring(indexOfDot + 1, path.length());
        }
        return "";
    }

    public String getDisk() {
        if (path == null || "".equals(path)) {
            return "";
        }
        int index = path.indexOf('\\');
        if (index != -1) {
            return path.substring(0, index);
        }
        return "";
    }

    public String[] getFolders() {
        if (path == null || "".equals(path)) {
            return null;
        }

        int start = path.indexOf("\\");
        int end = path.lastIndexOf("\\");
        if (start != -1 && end != -1) {
            String folders = path.substring(start + 1, end);
            return folders.split("\\\\");
            //System.out.println(folders);
        }

        return null;
    }
}