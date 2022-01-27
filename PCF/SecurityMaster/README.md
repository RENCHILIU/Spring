# SecurityMaster MS learning notes

## SQL

### AS - alias

making the column headings more meaningful, and use the column alias for an expression

### utl_math.JARO_WINKLER_SIMILARITY

[UTL_MATCH](https://docs.oracle.com/en/database/oracle/oracle-database/21/arpls/UTL_MATCH.html#GUID-7F579819-995A-4E92-862A-3E9ED13AA236)

### REGEXP_LIKE

[Pattern-matching Conditions](https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/Pattern-matching-Conditions.html#GUID-3FA7F5AB-AC64-4200-8F90-294101428C26)

### SUB_STR

```
The SUBSTR functions return a portion of char, beginning at character position, substring_length characters long. SUBSTR calculates lengths using characters as defined by the input character set. SUBSTRB uses bytes instead of characters. SUBSTRC uses Unicode complete characters. SUBSTR2 uses UCS2 code points. SUBSTR4 uses UCS4 code points.

If position is 0, then it is treated as 1.

If position is positive, then Oracle Database counts from the beginning of char to find the first character.

If position is negative, then Oracle counts backward from the end of char.

If substring_length is omitted, then Oracle returns all characters to the end of char. If substring_length is less than 1, then Oracle returns null.
```

[ref](https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/SUBSTR.html#GUID-C8A20B57-C647-4649-A379-8651AA97187E)

### CASE WHEN THEN

The CASE statement goes through conditions and returns a value when the first condition is met (like an if-then-else
statement). So, once a condition is true, it will stop reading and return the result. If no conditions are true, it
returns the value in the ELSE clause.

If there is no ELSE part and no conditions are true, it returns NULL.

```
    WHEN condition1 THEN result1
    WHEN condition2 THEN result2
    WHEN conditionN THEN resultN
    ELSE result
    END;
```

### ROWNUM

```
For each row returned by a query, the ROWNUM pseudocolumn returns a number indicating the order in which Oracle selects the row from a table or set of joined rows. The first row selected has a ROWNUM of 1, the second has 2, and so on.
```

[Sequence Pseudocolumns](https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/ROWNUM-Pseudocolumn.html#GUID-2E40EC12-3FCF-4A4F-B5F2-6BC669021726)

### ORDER BY ... DESC NULLS LAST

```
Syntax
ORDER BY { column-Name | ColumnPosition | Expression }
    [ ASC | DESC ]
    [ NULLS FIRST | NULLS LAST ]
    [ , column-Name | ColumnPosition | Expression 
    [ ASC | DESC ]
    [ NULLS FIRST | NULLS LAST ]
    ] * 
column-Name
Refers to the names visible from the SelectItems in the underlying query of the SELECT statement. The column-Name that you specify in the ORDER BY clause does not need to be the SELECT list.
ColumnPosition
An integer that identifies the number of the column in the SelectItems in the underlying query of the SELECT statement. ColumnPosition must be greater than 0 and not greater than the number of columns in the result table. In other words, if you want to order by a column, that column must be specified in the SELECT list.
Expression
A sort key expression, such as numeric, string, and date time expressions. Expression can also be a row value expression such as a scalar subquery or case expression.
ASC
Specifies that the results should be returned in ascending order. If the order is not specified, ASC is the default.
DESC
Specifies that the results should be returned in descending order.
NULLS FIRST
Specifies that NULL values should be returned before non-NULL values.
NULLS LAST
Specifies that NULL values should be returned after non-NULL values.
```

[ref](https://docs.oracle.com/javadb/10.8.3.0/ref/rrefsqlj13658.html)

## REGEX

```
\s         // match space
```

## JDBC Template

### ResultSetExtractor

extractData()

### ResultSet

### Stream

collect()
toList()

## Data Structure

### LinkedHashSet

### .enterSet()

