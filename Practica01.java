import java.util.Scanner;

public class App {

    // Clase Tarjeta
    static class Tarjeta {
        private int numero;
        private float saldo;
        private boolean activo;
        private float precio;

        // Constructor por defecto
        public Tarjeta() {
        }

        // Constructor con parámetros
        public Tarjeta(int numero, float saldo, boolean activo, float precio) {
            this.numero = numero;
            this.saldo = saldo;
            this.activo = activo;
            this.precio = precio;
        }

        // Métodos de acceso (getters y setters)
        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        public boolean isActivo() {
            return activo;
        }

        public void setActivo(boolean activo) {
            this.activo = activo;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        // Método para recargar saldo
        public boolean recargar(float monto) {
            if (monto > 0) {
                this.saldo += monto;
                return true;
            }
            return false;
        }

        // Método para consumir saldo
        public boolean consumir() {
            if (this.activo && this.saldo >= this.precio) {
                this.saldo -= this.precio;
                return true;
            }
            return false;
        }
    }

    // Clase Usuario
    static class Usuario {
        private String paterno;
        private String materno;
        private String nombres;
        private String documento;
        private String tipoDocumento;

        // Constructor por defecto
        public Usuario() {
        }

        // Constructor con parámetros
        public Usuario(String paterno, String materno, String nombres, String documento, String tipoDocumento) {
            this.paterno = paterno;
            this.materno = materno;
            this.nombres = nombres;
            this.documento = documento;
            this.tipoDocumento = tipoDocumento;
        }

        // Métodos de acceso (getters y setters)
        public String getPaterno() {
            return paterno;
        }

        public void setPaterno(String paterno) {
            this.paterno = paterno;
        }

        public String getMaterno() {
            return materno;
        }

        public void setMaterno(String materno) {
            this.materno = materno;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getDocumento() {
            return documento;
        }

        public void setDocumento(String documento) {
            this.documento = documento;
        }

        public String getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        // Método para recargar saldo
        public float recargar(float monto) {
            return monto > 0 ? monto : 0;
        }

        // Método para consumir
        public boolean consumir() {
            return true; // Implementar la lógica de consumo según sea necesario
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de una Tarjeta
        System.out.println("Ingrese el número de la tarjeta:");
        int numero = scanner.nextInt();

        System.out.println("Ingrese el saldo inicial:");
        float saldo = scanner.nextFloat();

        System.out.println("¿Está activa la tarjeta? (true/false):");
        boolean activo = scanner.nextBoolean();

        System.out.println("Ingrese el precio del producto:");
        float precio = scanner.nextFloat();

        Tarjeta tarjeta = new Tarjeta(numero, saldo, activo, precio);

        // Intentar recargar la tarjeta
        System.out.println("Ingrese el monto para recargar:");
        float montoRecarga = scanner.nextFloat();
        if (tarjeta.recargar(montoRecarga)) {
            System.out.println("Recarga exitosa. Saldo actual: " + tarjeta.getSaldo());
        } else {
            System.out.println("Recarga fallida.");
        }

        // Intentar consumir de la tarjeta
        if (tarjeta.consumir()) {
            System.out.println("Consumo exitoso. Saldo restante: " + tarjeta.getSaldo());
        } else {
            System.out.println("Consumo fallido. No hay suficiente saldo o la tarjeta está inactiva.");
        }

        // Creación de un Usuario
        scanner.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese el apellido paterno:");
        String paterno = scanner.nextLine();

        System.out.println("Ingrese el apellido materno:");
        String materno = scanner.nextLine();

        System.out.println("Ingrese los nombres:");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese el documento:");
        String documento = scanner.nextLine();

        System.out.println("Ingrese el tipo de documento:");
        String tipoDocumento = scanner.nextLine();

        Usuario usuario = new Usuario(paterno, materno, nombres, documento, tipoDocumento);

        System.out.println("Usuario registrado: " + usuario.getNombres() + " " + usuario.getPaterno() + " " + usuario.getMaterno());

        scanner.close();
    }
}
