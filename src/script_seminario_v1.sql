create database wikidrinks
USE [wikidrinks]
GO
/****** Object:  Table [dbo].[facturas]    Script Date: 08/10/2018 14:44:57 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tragos](
	[trago_id] [varchar](255) NOT NULL,
	[nombre] [varchar](255) NULL,
	[vaso] [varchar](50) NULL,
	[graduacion] [int] NULL,
	[imagen][image] NULL,
PRIMARY KEY CLUSTERED 
(
	[trago_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[productos]    Script Date: 08/10/2018 14:44:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ingredientes](
	[ingrediente_id] [varchar](255) NOT NULL,
	[nombre] [varchar](255) NULL,
	[medida] [varchar](255)NOT NULL,	
PRIMARY KEY CLUSTERED 
(
	[ingrediente_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[reclamos]    Script Date: 08/10/2018 14:44:58 ******/

/****** Object:  Table [dbo].[usuarios]    Script Date: 08/10/2018 14:44:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[usuarios](
	[usuario_id] [varchar](255) NOT NULL,
	[username] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[telefono] [varchar](255) NULL,
	[mail] [varchar](255) NULL,
	[direccion] [varchar](255) NULL,
	[activo] [tinyint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[usuario_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tragos_ingredientes](
	[trago_id] [varchar](255) NOT NULL,
	[ingrediente_id] [varchar](255) NULL,
);


ALTER TABLE [dbo].[tragos_ingredientes]  WITH CHECK ADD  CONSTRAINT [FK1E7DA7FB53C8BFAA] FOREIGN KEY([trago_id])
REFERENCES [dbo].[tragos] ([trago_id])
GO
ALTER TABLE [dbo].[tragos_ingredientes] CHECK CONSTRAINT [FK1E7DA7FB53C8BFAA]
GO
ALTER TABLE [dbo].[tragos_ingredientes]  WITH CHECK ADD  CONSTRAINT [FK1E7DA7FB9F4F6735] FOREIGN KEY([ingrediente_id])
REFERENCES [dbo].[ingredientes] ([ingrediente_id])
GO
ALTER TABLE [dbo].[tragos_ingredientes] CHECK CONSTRAINT [FK1E7DA7FB9F4F6735]
GO
