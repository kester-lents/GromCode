package lesson29;

/**
 * Created by Ruslan on 16.09.2018.
 */
public class File implements Comparable<File> {
    private String fileName;
    private long sizeInBytes;

    public File(String fileName, long sizeInBytes) {
        this.fileName = fileName;
        this.sizeInBytes = sizeInBytes;
    }

    @Override
    public int compareTo(File file) {
        int res = 0;
        if (file.getSizeInBytes() > this.sizeInBytes)
            res = 1;
        else if (file.getSizeInBytes() < this.sizeInBytes)
            res = -1;
        return res;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", sizeInBytes=" + sizeInBytes +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (sizeInBytes != file.sizeInBytes) return false;
        return fileName != null ? fileName.equals(file.fileName) : file.fileName == null;
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + (int) (sizeInBytes ^ (sizeInBytes >>> 32));
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        return fileName.equals(file.fileName);
    }

    @Override
    public int hashCode() {
        return fileName.hashCode();
    }
}
