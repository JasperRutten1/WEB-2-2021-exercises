package domain.model.commandHandelers;

public enum Commands {
    AddStudent(new AddStudentHandler()),
    SearchStudent(new SearchStudentHandler()),
    ListStudents(new ListStudentsHandler()),
    RemoveStudent(new RemoveStudentHandler()),
    ConfirmRemoveStudent(new ConfirmRemoveStudentHandler());

    private CommandHandler handler;

    Commands(CommandHandler handler){
        this.handler = handler;
    }

    public CommandHandler getHandler() {
        return handler;
    }

    public String getCommandName(){
        return handler.getCommandName();
    }

    public static Commands getCommand(String commandName){
        for(Commands commands : values()){
            if(commands.getCommandName().equals(commandName)) return commands;
        }
        return null;
    }
}
