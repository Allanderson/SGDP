function saudacao() {
    hoje = new Date();
    saudacaoAtual = hoje.getHours();

    if (saudacaoAtual > 4 && saudacaoAtual <= 11) {
        document.writeln("Bom Dia");
    } else if (saudacaoAtual > 11 && saudacaoAtual <= 17) {
        document.writeln("Boa Tarde");
    } else {
        document.writeln("Boa Noite");
    }
}

