class Test {

    public static void main(String[] args) {
        new TeamLead(1);
    }

    public static class TeamLead extends Programmer {

        private final int numTeamLead;

        public TeamLead(int numTeamLead) {
            super(numTeamLead);
            this.numTeamLead = numTeamLead;
            employ();
        }

        protected void employ() {
            System.out.println(numTeamLead + " teamlead");
        }

    }

    public static class Programmer {

        private final int numProgrammer;

        public Programmer(int numProgrammer) {
            this.numProgrammer = numProgrammer;
            employ();
        }

        private void employ() {
            System.out.println(numProgrammer + " programmer");
        }
    }
}
/*
Вы решили создать свой собственный проект, и для этого вам нужно нанять 1 программиста и 1 тимлида.
Вы написали код для этого, но он не работает.

Ваша задача - найти ошибку.

Примечание: не переименовывайте методы и не создавайте свои собственные классы, а также не создавайте новые объекты.
Не используйте super и this .

Совет: какие методы могут быть унаследованы?
 */