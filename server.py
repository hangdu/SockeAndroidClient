import socket               # Import socket module
import json

s = socket.socket()         # Create a socket object
#host = socket.gethostname() # Get local machine name
host = "192.168.0.9"
port = 12345                # Reserve a port for your service.
s.bind((host, port))        # Bind to the port

s.listen(5)                 # Now wait for client connection.
while True:
   c, addr = s.accept()     # Establish connection with client.
   print('Got connection from', addr)
   text = 'Thank you for connecting'
   #size = c.send(text.encode())
   content = c.recv(1024).decode()
   print(content)
   #dict = json.loads(content)
   #strengthVals = dict['StrengthVals']
   #print(strengthVals)
   #print('name is' + dict['Name'])
   c.close()                # Close the connection
