##
## EPITECH PROJECT, 2020
## makefile exe
## File description:
## fct
##

SRC = architect.jar

NAME = 102architect

all:
	mkdir class/
	javac -d ./class architect/src/re/anthonyvienne/architect/Main.java architect/src/re/anthonyvienne/architect/Geometry/matrix.java
	cp -r manifest.mf class/
	cd class/ && jar cmf manifest.mf architect.jar re/anthonyvienne/architect/Main.class re/anthonyvienne/architect/Geometry/matrix.class
	cp -r class/$(SRC) ./
	cp 102architect.sh $(NAME)
	chmod 755 $(NAME)

clean:
	rm -r class/
	rm $(SRC)

fclean: clean
	rm $(NAME)

re:	fclean all
