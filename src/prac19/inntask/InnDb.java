package prac19.inntask;

import java.util.HashMap;
import java.util.Map;

public class InnDb {
    private final Map<String, String> db = new HashMap<>();

    public InnDb() {
    }

    public void  addInn(String inn, String name){
        validInn(inn);
        validName(name);
        db.put(inn, name);
    }

    public Map<String, String> getDb() {
        return db;
    }

    public void checkClient(String inn, String name){
        validName(name);
        validInn(inn);
        String getName = db.get(inn);
        if (getName == null){
            throw new BadInnException(inn+ " не найден в базе клиентов");
        }
        if(!getName.equals(name)){
            throw new IligalINNException(inn + " принадлежит не принадлежит " + name);
        }
    }
    public void validName(String name){
        if (name == null || !name.matches("[А-ЯЁ][а-яё]*\\s[А-ЯЁ][а-яё]*\\s[А-ЯЁ][а-яё]*")){
            throw new BadNameException("Введено некорректное имя: Нужно в формате Фамилия Имя Отчество");
        }
    }
    public void validInn(String inn){
        if (inn == null || !inn.matches("\\d{10}|\\d{12}")){
            throw new BadInnException("Введён инн в неверном формате");
        }
    }
}
