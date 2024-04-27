# Distributed File Storage System

This project demonstrates a basic implementation of a distributed file storage system in Java. The system allows multiple nodes to store and retrieve files in a distributed manner.

## Components

1. **Node**: Represents a storage node in the distributed system. Each node can store files locally and communicate with other nodes.
2. **DistributedFileStorageSystem**: Manages the interactions between nodes and provides methods for uploading, downloading, and deleting files.

## Usage

1. Instantiate a `DistributedFileStorageSystem` object to create the distributed file storage system.
2. Add nodes to the system using the `addNode()` method.
3. Upload files to a specific node using the `uploadFile()` method.
4. Download files from a node using the `downloadFile()` method.
5. Delete files from a node using the `deleteFile()` method.

## Example

```java
public class Main {
    public static void main(String[] args) {
        DistributedFileStorageSystem fileStorageSystem = new DistributedFileStorageSystem();

        // Add nodes to the system
        fileStorageSystem.addNode("Node1");
        fileStorageSystem.addNode("Node2");

        // Upload a file to Node1
        fileStorageSystem.uploadFile("Node1", "file.txt", "This is the content of the file.");

        // Download the file from Node1
        String content = fileStorageSystem.downloadFile("Node1", "file.txt");
        System.out.println("Downloaded file content: " + content);

        // Delete the file from Node1
        fileStorageSystem.deleteFile("Node1", "file.txt");
    }
}

```

## Features

- **Distributed Storage**: Files are distributed across multiple nodes for scalability and fault tolerance.
- **Basic Operations**: Supports basic file operations such as upload, download, and deletion.
- **Flexibility**: Allows adding and removing nodes dynamically to adapt to changing storage requirements.

## Contributing

Contributions are welcome! If you have any ideas for improvements or new features, feel free to open an issue or submit a pull request.

## Credits

This project was created by Jeel patel.
