#!/bin/bash -ex

SRC=src
BIN=bin
JAVA=java
JAVAC='javac -d bin'
CP='-cp bin'
rm -rf bin
mkdir bin
javac -d bin src/MaxSumSubArrayOfSizeK.java
java -cp bin MaxSumSubArrayOfSizeK
