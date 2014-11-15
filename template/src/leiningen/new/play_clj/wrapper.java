package {{java-package}};
import clojure.lang.IFn;
import clojure.java.api.Clojure;
public class Main {
    public static void main(String[] args) {
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("{{desktop-namespace}}"));
        IFn app = Clojure.var("{{desktop-namespace}}", "-main");
        app.invoke();

    }
}
