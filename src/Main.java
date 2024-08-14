//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    // Cria uma instância da classe Iphone
    Iphone iphone = new Iphone();

    // Testa a reprodução de música
    iphone.reproduzirMusica();
    iphone.pausarMusica();

    // Testa funcionalidades de telefone
    iphone.fazerChamada("123456789");
    iphone.receberChamada("987654321");

    // Testa navegação na internet
    iphone.abrirPagina("www.example.com");
    iphone.fecharPagina();
}