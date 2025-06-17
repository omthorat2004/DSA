def simple_chatbot():
    print("Chatbot: Hi! I'm a simple chatbot. Type 'quit' to exit.")
    
    while True:
        user_input = input("You: ").lower()
        
        if user_input == 'quit':
            print("Chatbot: Goodbye!")
            break
        
        elif 'hello' in user_input or 'hi' in user_input:
            print("Chatbot: Hello there!")
        
        elif 'how are you' in user_input:
            print("Chatbot: I'm just a program, but thanks for asking!")
        
        elif 'your name' in user_input:
            print("Chatbot: I'm SimpleBot!")
        
        elif 'bye' in user_input:
            print("Chatbot: See you later!")
            break
        
        else:
            print("Chatbot: I didn't understand that. Can you rephrase?")
simple_chatbot()