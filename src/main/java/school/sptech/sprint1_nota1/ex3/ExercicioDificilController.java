package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    private ExercicioDificilResponse edr;

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        int num1 = 0;
        int num2 = 1;
        int soma = 1;

        if(n <= 0){
            edr = new ExercicioDificilResponse(0,0);
            return edr;
        }
        if(n == 1){
            edr = new ExercicioDificilResponse(1,1);
            return edr;
        }
        for(int i = 2; i <= n; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            soma += num2;
        }
        edr = new ExercicioDificilResponse(num2, soma);
        return edr;
    }
}
