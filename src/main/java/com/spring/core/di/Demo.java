package com.spring.core.di;

class DependencyA {

    private DependencyB dependencyB;

//    public DependencyA(DependencyB dependencyB) {
//        this.dependencyB = dependencyB;
//    }

    public void setDependencyB(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }
}

class DependencyB {

    private DependencyA dependencyA;

//    public DependencyB(DependencyA dependencyA) {
//        this.dependencyA = dependencyA;
//    }

        public void setDependencyA(DependencyA dependencyA) {
            this.dependencyA = dependencyA;
        }

}

class DependencyC {

}

public class Demo {

    private DependencyA dependencyA;
    private DependencyB dependencyB;
    private DependencyC dependencyC;

//    public Demo(DependencyA dependencyA, DependencyB dependencyB, DependencyC dependencyC) {
//        this.dependencyA = dependencyA;
//        this.dependencyB = dependencyB;
//        this.dependencyC = dependencyC;
//    }

    public void setDependencyA(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }

    public void setDependencyB(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }

    public void setDependencyC(DependencyC dependencyC) {
        this.dependencyC = dependencyC;
    }


}
