import mysql.connector
try:
    cnx = mysql.connector.connect(user='testuser', password='304testpw', host='localhost', database='workson')
    cursor = cnx.cursor(buffered=True)
    query = "SELECT ename, salary FROM emp"                
    cursor.execute(query)
    for (ename, salary) in cursor:
        print(ename, salary)
    cursor.close()
except mysql.connector.Error as err:  
    print(err)
finally:
    cnx.close()