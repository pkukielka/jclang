jclang - Java bindings for Clang 3.3
-----

This repository contains java bindings for Clang 3.3.
All java files were auto generated using [JNAerator](http://code.google.com/p/jnaerator).

Original clang c bindings are placed in src/main/c/clang-c directory.  
JNAerator configuration file you can find in src/main/jnaerator/conf.jnaerator.
All generated java bindings are in src/main/java/clang.  

Purpose of this project is not only to provide bindings for Clang 3.3 but also to create simple structure
which allow you to regenerate all java files in case of Clang update.  
To do that you need to copy llvm/tools/clang/include/clang-c directory to src/main/c/clang-c, update conf.jnaerator
with recent list of clang-c headers and call:
 ```mvn install```
