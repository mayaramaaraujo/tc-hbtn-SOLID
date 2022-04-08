public class Functions {
    // Faça somente 1 coisa
    //A
    public void saveCash(Income income, Expense expense){
        inRepo.save(income);
        outRepo.save(expense);
    }

    //Somente 1 nível de abstração
    //A
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.save(user);
    }
    //B

    // Arguments
    //A
    public void saveUser(User user){};

    //  No side effects
    public User saveUser(User user){
        // if statement should be avoided, why saveUser action is changing role of a user?
        if(user.isAdmin){
            user.setRole(user);
        }
        return userRepository.save(user);
    }
    // Evite duplicados, extraindo para novos métodos

    //B
    public Environment getEnvironment(){
        return environmentService.getEnvironment(getVersion());
    }
    public Release getRelease(){
        return releaseService.getRelease(getVersion());
    }
    private String getVersion(){ 
        return versionService.getVersion();
    }

}