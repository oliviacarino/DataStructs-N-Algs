#!/bin/bash -ex

SRC=src
BIN=bin
JAVA=java
JAVAC='javac -d bin'
CP='-cp bin'
rm -rf bin
mkdir bin
javac -d bin src/Edge.java
javac -cp bin -d bin src/Graph.java
javac -cp bin -d bin src/BreadthFirstSearch.java
java -cp bin BreadthFirstSearch
