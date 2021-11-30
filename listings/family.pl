person(john).
person(anna).
person(mike).
person(jane).
male(john).
male(mike).
female(anna).
female(jane).
parent(mike, john).
parent(mike, anna).
parent(jane, anna).

father(X, Y) :- male(X), parent(X, Y).
mother(X, Y) :- female(X), parent(X, Y).
sibling(X, Y) :- parent(Z, X), parent(Z, Y).