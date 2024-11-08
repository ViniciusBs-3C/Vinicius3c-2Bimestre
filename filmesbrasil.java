// Lista de filmes brasileiros com diferentes gêneros
const filmes = [
    { titulo: "Cidade de Deus", genero: "Crime" },
    { titulo: "Tropa de Elite", genero: "Ação" },
    { titulo: "Central do Brasil", genero: "Drama" },
    { titulo: "O Auto da Compadecida", genero: "Comédia" },
    { titulo: "Bacurau", genero: "Suspense" },
    { titulo: "Que Horas Ela Volta?", genero: "Drama" },
    { titulo: "Hoje Eu Quero Voltar Sozinho", genero: "Romance" },
    { titulo: "Aquarius", genero: "Drama" },
    { titulo: "O Pagador de Promessas", genero: "Clássico" },
    { titulo: "A Vida Invisível", genero: "Drama" },
];

// Função para recomendar filmes com base no gênero escolhido
function recomendarFilmes(genero) {
    const recomendacoes = filmes.filter(filme => filme.genero.toLowerCase() === genero.toLowerCase());
    
    if (recomendacoes.length > 0) {
        console.log(`Filmes recomendados no gênero ${genero}:`);
        recomendacoes.forEach(filme => console.log(`- ${filme.titulo}`));
    } else {
        console.log(`Desculpe, não temos recomendações no gênero "${genero}".`);
    }
}

// Exemplo de uso:
// Solicite ao usuário o gênero de filme preferido
const generoUsuario = prompt("Qual gênero de filme você gostaria de assistir? (ex: Drama, Ação, Comédia)");
recomendarFilmes(generoUsuario);
