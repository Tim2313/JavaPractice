if [ ! -d "./build" ]
then 
	mkdir build
fi 

if [ "$(ls -A ./build)" ]
then
	rm ./build/*
fi

if [ -z $1 ] || [ -z $2 ]
then
	echo "Ей надо ввеcти аргументы"
	exit 1
fi

javac -d ./build $1

java -cp "./build" $2 "$3"


