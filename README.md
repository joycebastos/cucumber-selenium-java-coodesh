# cucumber-selenium-java-coodesh

Tecnologias utilizadas: Selenium Webdriver, Cucumber e Maven

Linguagem: Java

Prática utilizada: BDD (Behavior Driven Development)

Os cenários foram descritos utilizando BDD.

Para rodar os cenários é necessário verificar a versão do browser instalada no computador e baixar o driver correspondete a versão. Por exemplo, para rodar os testes o chrome, é preciso verificar a versão do chrome no computador e baixar o driver correspondete em https://chromedriver.chromium.org/downloads

Nestes testes a versão do chrome é 86 e o drive é Supports Chrome version 86

Design Patterns utilizado nos testes: Page objects e BDD

Estrutura dos testes

URL base: https://beta.coodesh.com/
pages : encontram-se as page objects que contém as ações dos cenários
steps : encontram-se a implementação de cada passo escrito nos cenários de BDD (dentro da pasta features). As Steps chamam as ações contidas em page objects. Nas steps a única ação executada são as de asserções.
features: encontram-se a descrição dos cenários de testes testados no formato BDD.
Utils: pasta onde encontram-se classes que serão uteis a todos os projetos. Como por exemplo a classe que abre o browser. Nesta classe existe um método que realiza os testes no chrome e um método que realiza os testes no firefox.

Observação: após a subida do projeto no reprositorio foi retirado o caminho (path) do driver pois ele depende de onde está armazenado no local onde os testes irão rodar.