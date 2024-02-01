#!/bin/bash
## Pau gra

ruta="/home/daw/pau/Repos/java-daw/"

pwd
	echo "------Menu-------"
	echo "-    1. Exit    -"
	echo "- 2. Upload all -"
	echo "- 3. Download   -"
	echo "-----------------"

	read -p "Wich is the desired input? " answ
	case "$answ" in 
		1)
			exit 0
		;;	
		2)
			cd $ruta
			git add .
			read -p "Deliver the correct input " incommit
			git commit -m "$incommit"
			git push 	
		;;
		3)
			cd $ruta
			git pull 
		;;
		*)
			echo "Invalid input"
		;;
	esac

exit 0

