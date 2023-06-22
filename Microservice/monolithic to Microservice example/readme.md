# monolithic

                 +-------------------+
                 |    Tax-GUI        |
                 |                   |
                 +--------+----------+
                          |
                          | HTTP
                          |
                 +--------v----------+
                 |  Tax-DataBase     |
                 |                   |
                 +--------+----------+
                          |
                          | HTTP
                          |
                 +--------v----------+
                 |  TaxCalEngine     |
                 |                   |
                 +-------------------+



The Tax-GUI microservice directly calls the Tax-DataBase microservice to retrieve the country list data.
The Tax-GUI microservice also calls the TaxCalEngine microservice to get the outcome of the calculation.
The TaxCalEngine microservice calls the Tax-DataBase microservice to retrieve the rate value and perform the calculation. It then sends the calculated result back to the Tax-GUI microservice.