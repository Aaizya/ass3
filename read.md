## The code
The code is an implementation of a generalized hash table in Java. The hash table uses the separate chaining approach to resolve collisions, that is, each "bouquet" stores a linked list of key-value pairs.

The functionality of the code includes:

Inserting and updating key-value pairs.
Getting values by key.
Deleting key-value pairs.
Checking for the presence of a certain value.
Getting keys by values.
# MyHashTable

MyHashTable is a generic implementation of a hash table data structure in Java. It uses separate chaining to handle collisions, which means that each bucket in the hash table contains a linked list of key-value pairs.

## Features

- Insertion and updating of key-value pairs.
- Retrieval of values based on keys.
- Removal of key-value pairs.
- Checking for the presence of a specific value.
- Retrieving keys based on values.

## Usage

To use the MyHashTable class, follow these steps:

1. Import the `MyHashTable` class into your Java project.

2. Create an instance of the `MyHashTable` class, specifying the types for the keys and values. For example:

   ```java
   MyHashTable<Integer, String> table = new MyHashTable<>();
