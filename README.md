># Java Collections: Dominando Listas Sets e Mapas
>## Repositório para guardar os arquivos do curso Java Collections Dominando Listas Sets e Mapas

### Preparando Ambiente em todos SOs

É importante que você tenha a JDK instalado em sua máquina para que possa testá-los localmente e também para os demais exercícios propostos.

Siga aqui os passos de instalação de uma VM no sistema operacional que você usa: Linux, Mac OSX ou Windows:

## *Linux*

No Ubuntu o processo de instalação mais rápido e simples é o do open-jdk, uma implementação open source do JDK:

~~~
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt-get install openjdk-8-jdk
~~~

No Linux Fedora você pode instalar com:
~~~
su -c "yum install java-1.8.0-openjdk"
~~~
Após a instalação no seu Linux teste seu java com os comandos:
~~~
javac -version

java -version
~~~
## *Mac OSX*

No Mac OSX você pode baixar a versão 1.8 do Java SDK em http://jdk.java.net/8/ Após executar o instalador, será necessário entrar no painel de Preferences, Java Preferences e alterar a versão do Java para a nova que você acaba de instalar.

Após a instalação no seu Mac OSX teste seu java com os comandos :
~~~
javac -version

java -version
~~~
## *Windows*

Por fim, para instalar o SDK do Windows, acesse: http://www.oracle.com/technetwork/java/

Dentre os top downloads, escolha o Java SE: http://www.oracle.com/technetwork/java/javase/downloads/index.html

Escolha então o JDK (Java Development Kit) e por fim a versão de seu sistema operacional. Execute o arquivo jdk-versão-windows-arquitetura-p.exe e passe pelo wizard de instalação. O registro de sua VM no site da Oracle é opcional.

Clique agora com o botão da direita sobre o Computador, escolha Propriedades. Na aba Configurações Avançadas do Sistema clique em Variáveis de Ambiente.

Clique no botão Novo para adicionar uma nova variável: seu nome é JAVA_HOME (tudo maiúsculo) e seu valor será o diretório onde instalou o Java (provavelmente algo como C:\Program Files\Java\jdk1.8.0_03).

Clique no botão Novo para adicionar uma nova variável: seu nome é PATH (tudo maiúsculo) e seu valor será o %JAVA_HOME%.

Agora vamos alterar a variável PATH. Não crie uma variável nova, altere a variável PATH que já existe. Escolha ela e clique em Editar. No final do valor atual complemente com o valor %JAVA_HOME%\bin. Não se esqueça do ponto e vírgula que separa o path anterior desse novo path que estamos colocando.

Pronto, feche todas as janelas e abra o prompt, indo em Iniciar, Executar e digite cmd.

Após a instalação no seu Windows teste seu java com os comandos
~~~
java -version

javac -version
~~~
Após configurar a VM e o SDK, o resultado do comando javac -version deve ser a versão de seu Java, como por exemplo 1.8.03 (depende somente da versão instalada na sua máquina).
