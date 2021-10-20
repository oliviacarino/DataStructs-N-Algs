#!/bin/bash -ex

SRC=src
BIN=bin
JAVA=java
JAVAC='javac -d bin'
CP='-cp bin'
rm -rf bin
mkdir bin
javac -d bin src/Node.java
javac -cp bin -d bin src/SinglyLinkedList.java
javac -cp bin -d bin src/Driver.java
java -cp bin Driver
