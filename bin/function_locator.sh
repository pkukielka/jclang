#!/bin/sh

files=$1/*.cpp
for f in $files
do
    echo ""
    echo "----- $f -----"
    while read symbol
    do
        match=$(grep "$symbol\(.*\) {" $f | grep -v "^\s ")
        if [ $? -eq 0 ]
        then
            echo "$symbol"
        fi
    done < "$1/libclang.exports"
done
