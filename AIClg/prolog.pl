% Facts
in_room(monkey).
in_room(chair).
in_room(banana).

clever(monkey).
tall(chair).

can_climb(monkey, chair).
can_move(monkey, chair, banana).

% Rules

% The monkey can get on something if it can climb it
get_on(X, Y) :-
    can_climb(X, Y).

% The object (like a chair) is under another (like banana)
under(Y, Z) :-
    in_room(Y),
    in_room(Z),
    can_move(monkey, Y, Z).

% Monkey is close to the banana if it gets on the chair and the chair is under the banana
close(X, Z) :-
    get_on(X, Y),
    under(Y, Z),
    tall(Y).


can_reach(X, Y) :-
    clever(X),
    close(X, Y).
