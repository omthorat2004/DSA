def is_goal(state):
    return state[0] == 2 or state[1] == 2
def get_next_states(a, b, max_a, max_b):
    return [
        (0, b),          # Empty jug A
        (a, 0),          # Empty jug B
        (max_a, b),      # Fill jug A
        (a, max_b),      # Fill jug B   
        # Pour A → B
        (a - min(a, max_b - b), b + min(a, max_b - b)),
        # Pour B → A
        (a + min(b, max_a - a), b - min(b, max_a - a)),
    ]
def bfs_water_jug(start,max_a,max_b):
    visited = set()
    queue = []
    queue.append((start,[start]))
    
    while queue:
        (curr_a,curr_b),path = queue.pop()
        
        if (curr_a, curr_b) in visited:
            continue
        visited.add((curr_a, curr_b))
        
        if is_goal((curr_a,curr_b)):
            print("Goal Reached")
 
            for step in path:
                print(step)
            return

        for state in get_next_states(curr_a,curr_b,max_a,max_b):
            if state not in visited:
                queue.append((state,path+[state]))    
bfs_water_jug((0, 0), 4, 3)