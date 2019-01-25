# Photo Album Assignment

This is an assignment to list the id and the title of the photo albums list from a list given in the URL: https://jsonplaceholder.typicode.com/photos.

## Installation

Clone the entire photo-album project from git

```bash
git clone https://github.com/nakibkhan/photo-album.git
```

Once downloaded, please run a Maven build. Preferably use version 3.5.0 or higher.

```bash
mvn clean install
```

Once Maven has run a build. A target/ folder will be created that will contain the built photo-album-1.0-SNAPSHOT.jar file. 

The Java JAR file can be run in multiple ways to deploy either a Console Application or Web Application


## Usage Console

Running the Java JAR file with arguments ("photo-album {albumId}") will output the results in the console environment 

```bash
java -jar photo-album-1.0-SNAPSHOT.jar photo-album 3
```

## Usage Web 

Run the Java JAR without any arguments 

```bash
java -jar photo-album-1.0-SNAPSHOT.jar 
```

1) Open a browser and go to URL depending upon the photo album id required 

Example :
localhost:8080/photo-album/photoId/{photoId}

2) To show all the photo information please use the following URL:

localhost:8080/photo-album/