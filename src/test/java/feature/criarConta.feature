# language: pt
Funcionalidade: Criar conta na página Beta da Coodesh
  Eu como um profissional em busca de vagas
  Quero me cadastrar na pagina da coodesh
  Para visualizar as vagas existentes

  Cenario: Cadastro de novo usuario
    Dado que cliquei no link Cadastre-se
    E preenchi os campo nome completo
    E preenchi o campo email
    E preenchi a senha
    E cliquei em aceitar termos e condicoes
    Quando clicar no botao inscreva-se
    Então devo ser redirecionada para a tela de onboarding
