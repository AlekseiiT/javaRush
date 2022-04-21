package com.company.lecture12.task_5;

/*
Ненужные абстракции
*/


public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, HasManagementPotential{
    }

    class Manager implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }

        public int[] solve(String word){
            char[] charArr = word.toCharArray();

            int upLetters = 0;
            int lowLetters = 0;
            int nums = 0;
            int cpecials = 0;

            for (char c : charArr){
                if (Character.isLetter(c)){
                    if(Character.isUpperCase(c))
                        upLetters++;
                    else
                        lowLetters++;
                }
                else if (Character.isDigit(c))
                    nums++;
                else
                    cpecials++;
            }
            System.out.println(1^3 + 5^3 + 3^3);
            return new int[]{upLetters, lowLetters, nums, cpecials};

        }
    }

    class Subordinate implements Secretary{
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}


