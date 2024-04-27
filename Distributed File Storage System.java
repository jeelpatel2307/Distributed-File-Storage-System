import java.util.HashMap;
import java.util.Map;

public class Node {
    private String name;
    private Map<String, String> files;

    public Node(String name) {
        this.name = name;
        this.files = new HashMap<>();
    }

    public void addFile(String fileName, String content) {
        files.put(fileName, content);
        System.out.println("File '" + fileName + "' added to node '" + name + "'.");
    }

    public String getFileContent(String fileName) {
        return files.get(fileName);
    }

    public void removeFile(String fileName) {
        files.remove(fileName);
        System.out.println("File '" + fileName + "' removed from node '" + name + "'.");
    }
}







import java.util.HashMap;
import java.util.Map;

public class DistributedFileStorageSystem {
    private Map<String, Node> nodes;

    public DistributedFileStorageSystem() {
        this.nodes = new HashMap<>();
    }

    public void addNode(String nodeName) {
        nodes.put(nodeName, new Node(nodeName));
        System.out.println("Node '" + nodeName + "' added to the system.");
    }

    public void uploadFile(String nodeName, String fileName, String content) {
        if (nodes.containsKey(nodeName)) {
            nodes.get(nodeName).addFile(fileName, content);
        } else {
            System.out.println("Node '" + nodeName + "' does not exist.");
        }
    }

    public String downloadFile(String nodeName, String fileName) {
        if (nodes.containsKey(nodeName)) {
            return nodes.get(nodeName).getFileContent(fileName);
        } else {
            System.out.println("Node '" + nodeName + "' does not exist.");
            return null;
        }
    }

    public void deleteFile(String nodeName, String fileName) {
        if (nodes.containsKey(nodeName)) {
            nodes.get(nodeName).removeFile(fileName);
        } else {
            System.out.println("Node '" + nodeName + "' does not exist.");
        }
    }
}
