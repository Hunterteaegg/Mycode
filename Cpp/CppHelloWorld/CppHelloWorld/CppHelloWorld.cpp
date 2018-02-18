#include <stdlib.h>
#include <iostream>
#include "stdafx.h"

#include "mysql_connection.h"

#include <cppconn/driver.h>
#include <cppconn/exception.h>
#include <cppconn/resultset.h>
#include <cppconn/statement.h>

using namespace std;

int main()
{
	cout << endl;
	cout << "正在执行 'SELECT 'Hello World!' AS _message'..." << endl;

	try {
		sql::Driver *driver;
		sql::Connection *con;
		sql::Statement *stmt;
		sql::ResultSet *res;

		/* 创建连接 */
		driver = get_driver_instance();
		con = driver->connect("tcp://127.0.0.1:3306", "root", "pwd");
		/* 连接 MySQL 数据库 test  */
		con->setSchema("test");

		stmt = con->createStatement();
		res = stmt->executeQuery("SELECT 'Hello World!' AS _message");
		while (res->next()) {
			cout << "\t... MySQL replies: ";
			/* 获取某列属性值通过列名 */
			cout << res->getString("_message") << endl;
			cout << "\t... MySQL says it again: ";
			/* 通过数字偏移量, 1 代表第一列 */
			cout << res->getString(1) << endl;
		}
		delete res;
		delete stmt;
		delete con;

	}
	catch (sql::SQLException &e) {
		cout << "# ERR: SQLException in " << __FILE__;
		cout << "(" << __FUNCTION__ << ") on line " << __LINE__ << endl;
		cout << "# ERR: " << e.what();
		cout << " (MySQL error code: " << e.getErrorCode();
		cout << ", SQLState: " << e.getSQLState() << " )" << endl;
	}

	cout << endl;

	return EXIT_SUCCESS;
}