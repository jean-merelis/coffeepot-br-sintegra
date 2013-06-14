coffeepot-br-sintegra
=====================

Project to be used in Brazil to write file in accordance to local regulations.

Este projeto é um mapeamento de classes Java para formatação e gravação do arquivo texto no layout definido para o SINTEGRA.

Projeto baseado em Maven. Utilizando JDK 1.7

Dependência: coffeepot-bean-wr - 
	https://github.com/jom76/coffeepot-bean-wr
	
Documentação técnica e layout:
  http://www.sefaz.es.gov.br/LegislacaoOnline/lpext.dll/InfobaseLegislacaoOnline/ricms%20-%20dec%201090-r/08%20-%20anexos/090-anexo%20xxxvi.htm?fn=document-frame.htm&f=templates&2.0	


Exemplo:

		//Criando o escritor
		Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));       
		SintegraWriter sintegraWriter = new SintegraWriter(fw);
		
		//Objeto que contém a estrutura do arquivo
		Sintegra sintegra = new Sintegra();
		// informa os registros
		//sintegra.setRegistro...
		
		//após informar todos os registros, gerar os registros tipo 90
		sintegra.gerarRegistros90();
		
		//Escrever o objeto no arquivo
        sintegraWriter.write(sintegra);		
 
		sintegraWriter.writerFlush();
        sintegraWriter.writerClose();
		


Jeandeson O. Merelis. <jean.merelis@gmail.com>
