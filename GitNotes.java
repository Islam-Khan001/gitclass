// use Remove-Item -Recurse -Force .git to remove connection from the remote
// repo
// rm .git/index.lock  -- to force a process to stop in terminal
// del .git\index.lock -- to force a process to stop in windows
// 


// git hooks are scripts that run automatically on a event in the git workflow.
// These Scripts can be customized to perform specific actions before or after certain git command are executed

// Example = you can setup a git hook to run certain tests before commiting change or to trigger a deployement process after pushing changes to a remote repo

// THERE ARE TWO TYPES OF HOOKS --
// 1 Client side hooks 
// 2 Server side hooks

// 1. CLIENT SIDE HOOKS - are scripts that run on your local machine when you interect with git repo
// 2. SERVER SIDE HOOKS - >>>>>>>> run on your remote repo 


