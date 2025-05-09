public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object obejto) {
        if (obejto instanceof Usuario) {
            Usuario outro = (Usuario) obejto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }
}
