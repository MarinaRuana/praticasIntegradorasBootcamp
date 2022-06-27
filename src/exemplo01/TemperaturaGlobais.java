package exemplo01;

public class TemperaturaGlobais {
    public static void main(String[] args) {

        String[] cidades = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Asuncion", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Toquio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int min = temperaturas[0][0];
        int max = temperaturas[0][0];

        int minId = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (min > temperaturas[i][0]) {
                min = temperaturas[i][0];
                minId = i;
            }
        }

        int maxId = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (max < temperaturas[i][1]) {
                max = temperaturas[i][1];
                maxId = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cidades[i] + "\nMin: " + temperaturas[i][0] + "\nMax: " + temperaturas[i][1]);
        }

        System.out.println("Maior temperatura: " + cidades[maxId] + " " + temperaturas[maxId][1]);
        System.out.println("Menor temperatura: " + cidades[minId] + " " + temperaturas[minId][0]);

    }
}
