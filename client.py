
import socket               # Import socket module
import json

s = socket.socket()         # Create a socket object
#host = socket.gethostname() # Get local machine name
host = "192.168.1.109"
port = 12345                # Reserve a port for your service.

s.connect((host, port))
print(s.recv(1024).decode())
pos = 'bedroom'
strengthVals = [3,4,1]
dict = {'Name': 'Zara', 'Position' : pos, 'StrengthVals' : strengthVals}
#text = 'Hello from client'
text = json.dumps(dict)
s.send(text.encode())
s.close                     # Close the socket when done
