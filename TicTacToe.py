#Global variable for convenience
theBoard = {'1': ' ', '2': ' ', '3': ' ',
 '4': ' ', '5': ' ', '6': ' ',
 '7': ' ', '8': ' ', '9': ' '}

def initialPrint():
 print("1" + '|' + "2" + '|' + "3")
 print('-+-+-')
 print("4" + '|' + "5" + '|' + "6")
 print('-+-+-')
 print("7"+ '|' + "8"+ '|' "9")

def printBoard(board):
 print(board['1'] + '|' + board['2'] + '|' + board['3'])
 print('-+-+-')
 print(board['4'] + '|' + board['5'] + '|' + board['6'])
 print('-+-+-')
 print(board['7'] + '|' + board['8'] + '|' + board['9'])

def isSomeBodyWin(board, moves):
  winning_moves=[[1,2,3],[4,5,6],[7,8,9],[1,4,7],[2,5,8],[3,6,9],[1,5,9],[3,5,7]]
  i=3
  count=0
  for move in winning_moves:
   while(i<3):
    if move[i] in moves:
     count+=1
    i+=1
   if(count==3):
    return True
   i=0
   count=0
  return False

def is_valid_input(move):
 if move not in "123456789":
   print("Not a valid input game will be terminated make sure to enter numbers 1-9")
   return False
 return True



def TicTacToe(board):
 print("This is classic TicTacToe Game. Please select one of the 9 positions to play. X goes first")
 initialPrint()
 print()
 print("_________________________________")
 turn='X'
 moves_x=[]
 moves_o=[]
 numberOfMoves=0

 while numberOfMoves<9 and not isSomeBodyWin(board, moves_o) and not isSomeBodyWin(board,moves_x):
  printBoard(board)
  move=input("please select one of the 9 positions indexed from 1-9" )
  if not is_valid_input(move):
   break
  board[move]=turn
  if turn=='X':
   moves_x.append(int(move))
   if isSomeBodyWin(board, moves_x):
    printBoard(board)
    print("Player 1 (X) wins")
   turn='O'
  else:
   moves_o.append(int(move))
   if isSomeBodyWin(board, moves_x):
     printBoard(board)
     print("Player 2 (O) wins")
   turn='X'
  numberOfMoves+=1
  print("______________________________________________________________________")





if __name__ =="__main__":
 TicTacToe(theBoard)


