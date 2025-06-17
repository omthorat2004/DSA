def print_solution(board):
    for row in board:
        print(row)
    print()

def is_safe(board, row, col, n):
    # Check this column on upper side
    for i in range(row):
        if board[i][col]:
            return False

    # Check upper-left diagonal
    i, j = row, col
    while i >= 0 and j >= 0:
        if board[i][j]:
            return False
        i -= 1
        j -= 1

    # Check upper-right diagonal
    i, j = row, col
    while i >= 0 and j < n:
        if board[i][j]:
            return False
        i -= 1
        j += 1

    return True

def solve_n_queens_util(board, row, n, solutions):
    if row == n:
        # All queens placed successfully
        solution = [row[:] for row in board]
        solutions.append(solution)
        return

    for col in range(n):
        if is_safe(board, row, col, n):
            board[row][col] = 1
            solve_n_queens_util(board, row + 1, n, solutions)
            board[row][col] = 0  # backtrack

def solve_n_queens(n):
    board = [[0] * n for _ in range(n)]
    solutions = []
    solve_n_queens_util(board, 0, n, solutions)
    print(f"Total solutions for {n}-Queens: {len(solutions)}")
    for solution in solutions:
        print_solution(solution)

# Run the solver
if __name__ == "__main__":
    N = 4  # Change this to any value, like 8
    solve_n_queens(N)
