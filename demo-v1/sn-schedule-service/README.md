# Notes

###### Important dotnet commands
-  `dotnet new webapi`: It is going to create a new RestApi project
-  `dotnet watch run`:  It executes the project
-  `dotnet aspnet-codegenerator controller -name <NewController> -async -api --readWriteActions -outDir Controllers`: It is going to create a new controller

###### Some important dependencies
- dotnet-ef: A tool for Entity Framework Migrations: `dotnet tool install --global dotnet-ef --version 3.1.5`
- dotnet-aspnet-codegenerator: For WebApi code generation: `dotnet tool install --global dotnet-aspnet-codegenerator --version 3.1.3`

- dotnet add package Microsoft.EntityFrameworkCore.Design
- dotnet add package Microsoft.EntityFrameworkCore.SqlServer.Design
- dotnet add package Microsoft.VisualStudio.Web.CodeGeneration.Design
- dotnet add package Microsoft.EntityFrameworkCore.SqlServer
- dotnet add package Microsoft.EntityFrameworkCore.Tools