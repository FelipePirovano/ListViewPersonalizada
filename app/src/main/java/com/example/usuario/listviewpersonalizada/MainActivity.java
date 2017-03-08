package com.example.usuario.listviewpersonalizada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
        //Passar parâmetros Arraylist===============================================================
    private void passarParametros(ArrayList<AtributosDaLista>p,int i,ArrayList<AtributosDaLista>r,int i2){

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("dados", p.get(i).getPergunta());
        intent.putExtra("dados2",r.get(i2).getResposta());
        startActivity(intent);
    }

    private ListView listViewPersonalizada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPersonalizada = (ListView) findViewById(R.id.listViewPersonalizada);

        final ArrayList<AtributosDaLista> perguntas = adicionarPerguntas();
        final ArrayList<AtributosDaLista> respostas = adicionarPerguntas();

        ArrayAdapter adapter = new AtributosAdapter(this, perguntas);
        listViewPersonalizada.setAdapter(adapter);
       //Onclick ListView===========================================================================
        listViewPersonalizada.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               if (i == 0){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 1){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 2){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 3){
                   passarParametros(perguntas,i,respostas,i);;
               }else if (i == 4){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 5){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 6){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 7){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 8){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 9){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 10){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 11){
                   passarParametros(perguntas,i,respostas,i);
               }else if (i == 12){
                   passarParametros(perguntas,i,respostas,i);
               }
            }
        });
    }
    private ArrayList<AtributosDaLista> adicionarPerguntas() {
        //Adicionar Perguntas e respostas===========================================================
        ArrayList<AtributosDaLista> perguntas = new ArrayList<AtributosDaLista>();
        AtributosDaLista
        e = new AtributosDaLista("1) Furou o pneu de minha moto, o que fazer?","Você deve comunicar a ocorrência imediatamente. Para isso, clique no ícone de exclamação no canto superior direito do app, e depois selecione a opção \"MOTO quebrou, furou o pneu ou sofri um acidente\". Desta forma, a corrida será reiniciada e outro motoboy poderá realiza-la.");
            perguntas.add(e);
        e = new AtributosDaLista("2) Utilizei outro GPS e a distância deu diferente do que no app da Motoboy.com, isso é algum erro?", "Não, não se trata de um erro. É normal haver diferença de distância entre apps diferentes, pois em geral cada app seleciona uma rota diferente no cálculo da distância. Utilizamos o mais avançada geotecnologia do mundo, que é a da Google Maps, para garantir a melhor rota possível para os entregadores.");
            perguntas.add(e);
        e = new AtributosDaLista("3) Como funciona o pagamento para a Motoboy.com?", "O fechamento do mês sempre ocorre no último dia do mês. Se o valor total dos locais de parada dos serviços prestados totalizar acima de R$25,00, lhe enviamos por email um boleto para pagamento. Se o valor total for abaixo de R$25,00, ele acumula para o próximo mês e nenhum boleto é enviado para pagamento."+"\n\nCaso você faça corridas pagas no cartão de crédito online, você tem a possibilidade de descontar essas corridas no total do valor devido. Entre em contato com nosso Suporte por WhatsApp 47 99910-8164 ou e-mail contato@motoboy.com se houver interesse em descontar seu pagamento com as corridas realizadas pagas com cartão de crédito online.");
            perguntas.add(e);
        e = new AtributosDaLista("4) Como faço para alterar minha senha?","Você consegue alterar sua senha direto em nosso website, basta acessar este link:\n\n https://www.motoboy.com/register/forgotPassword");
            perguntas.add(e);
        e = new AtributosDaLista("5) Aceitei a corrida sem querer, o que faço?","Você precisa fazer IMEDIATAMENTE 2 coisas:\n\n"+"1) Clique no ícone de exclamação no canto superior direito do app, e depois selecione a opção \"MOTO quebrou, furou o pneu ou sofri um acidente\". Desta forma, a corrida será reiniciada e outro motoboy poderá realiza-la."+"\n\n2) Depois disso, entre em contato com nosso atendimento via Whatsapp 47 99910-8164, informando que aceitou sem querer e que selecionou a ocorrência \"MOTO quebrou\" para reinicia-la."+"\n\nATENÇÃO: Para evitar corridas aceitas sem querer, é obrigatório confirmar 2 vezes no app que realmente poderá faze-la. Aceitar corridas sem querer pode resultar em punições temporárias ou permanentes. Somente aceite corridas em que possa honrar o solicitado. ");
            perguntas.add(e);
        e = new AtributosDaLista("6) Preciso solicitar uma transferência, como faço?","Caso você tenha saldo liberado em nosso aplicativo, ao estar online no app você verá uma opção para acessar seu extrato de comissões. Clique no botão \"Visualizar\" para visualizar seu extrato; role até o final da página e verá o botão ''Solicitar transferência\". Clique nele para ir até a tela onde poderá digitar seus dados bancários. Dentro de 3 dias úteis o valor estará em sua conta.");
            perguntas.add(e);
        e = new AtributosDaLista("7) Como funcionam as corridas no cartão de crédito online?","A corrida é feita normalmente, mas sem cobrança do cliente, que já efetuou o pagamento antecipadamente pelo cartão de crédito online. Após 30 dias, o valor estará liberado para transferência em nosso aplicativo.");
            perguntas.add(e);
        e = new AtributosDaLista("8) Qual o telefone de contato da Motoboy.com?","A Motoboy.com está adotando um modelo de atendimento que elimina o contato telefônico, evitando assim problemas de comunicação e custos de ligação. Para entrar em contato conosco, somente pelo WhatsApp 47 99910-8164 ou e-mail contato@motoboy.com");
            perguntas.add(e);
        e = new AtributosDaLista("9) Como faço para alterar meu email cadastrado?","Alteração de email somente é possível com o Suporte. Entre em contato por WhatsApp 47 99910-8164 ou e-mail contato@motoboy.com solicitando a alteração.");
            perguntas.add(e);
        e = new AtributosDaLista("10) Por quê as corridas agendadas só aparecem no app 15 min antes de começar?","As corridas agendadas são somente liberadas para visualização 15 min antes para evitar confusão com horários e endereços de outros serviços que estará realizando antes deste. Nossa experiência comprova que esse limite evita muitos problemas para os entregadores.");
            perguntas.add(e);
        e = new AtributosDaLista("11) Posso entrar em contato direto com o cliente?","Pode sim, inclusive o recomendado caso precise de mais informações sobre o serviço é que ligue diretamente ao cliente para pedir essas informações.");
            perguntas.add(e);
        e = new AtributosDaLista("12) Como faço emissão de nota fiscal?","Para emissão de nota fiscal, acesse o website da Prefeitura de sua cidade e pesquise por ''emisssão de nota fiscal'', ou entre em contato diretamente com a Prefeitura para mais informações");
            perguntas.add(e);
        e = new AtributosDaLista("13) Estou com uma problema na corrida atual, o que fazer?","Sempre que estiver com problemas em uma corrida em andamento, você deve comunicar a ocorrência IMEDIATAMENTE. Para isso, clique no ícone de exclamação no canto superior direito do app, e depois selecione na lista a ocorrência que melhor representa sua situação.");
            perguntas.add(e);
        return perguntas;
    }
}

