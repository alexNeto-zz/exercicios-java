import sys
import sqlite3
from warnings import catch_warnings

conexao = sqlite3.connect("agenda.db")
cursor = conexao.cursor()

try:
    cursor.execute('''
        create table agenda(
            nome text,
            email text,
            telefone text,
            matricula text,
            aulahora text
        )
    ''')
except sqlite3.Error as er:
    continue

conexao.commit()
cursor.close()
conexao.close()

def ler():
    try:
        cursor.execute("select * from agenda")
        while True:
            resultado = cursor.fetchone()
            if resultado == None:
                break
    except sqlite3.Error as er:
        continue

def guardar():
    try:
        cursor.execute('''
        insert into agenda(nome , email, telefone, matricula, aulahora) 
        values(?, ?, ?, ?, ?)
        ''', (nome, email, telefone, matricula, aulahora))
    except sqlite3.Error as er:
        continue

nome = sys.argv[1]
email = sys.argv[2]
telefone = sys.argv[3]
matricula = sys.argv[4]
aulahora = sys.argv[5]
