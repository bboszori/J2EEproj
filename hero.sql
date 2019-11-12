-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Gép: localhost:3306
-- Létrehozás ideje: 2019. Nov 13. 00:28
-- Kiszolgáló verziója: 5.7.27-0ubuntu0.18.04.1
-- PHP verzió: 7.2.19-0ubuntu0.18.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `hero`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `asset`
--

CREATE TABLE `asset` (
  `ID` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `building`
--

CREATE TABLE `building` (
  `ID` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `empire`
--

CREATE TABLE `empire` (
  `ID` bigint(20) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `empire_building`
--

CREATE TABLE `empire_building` (
  `Empire_ID` bigint(20) NOT NULL,
  `buildings_ID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `empire_stock`
--

CREATE TABLE `empire_stock` (
  `Empire_ID` bigint(20) NOT NULL,
  `stocks_ID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `hero`
--

CREATE TABLE `hero` (
  `id` int(11) NOT NULL,
  `description` longtext,
  `name` varchar(20) DEFAULT NULL,
  `USER_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- A tábla adatainak kiíratása `hero`
--

INSERT INTO `hero` (`id`, `description`, `name`, `USER_id`) VALUES
(1, '9', '9', 1),
(2, 'e', 'e', 1),
(3, 'w', 'w', 1),
(4, 'r', 'e', 1),
(5, '333', '333', 1),
(6, 'cccccc', 'ccc', 1),
(7, 'ssss', 'jsf', 1),
(8, NULL, NULL, 1),
(9, NULL, NULL, 1),
(10, 'eee', 'ee', 1),
(11, 'ddddd', 'dd', 1);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `hero_hybrid`
--

CREATE TABLE `hero_hybrid` (
  `Hero_ID` bigint(20) NOT NULL,
  `hybrids_ID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `hybrid`
--

CREATE TABLE `hybrid` (
  `ID` bigint(20) NOT NULL,
  `PERCENT` tinyint(4) DEFAULT NULL,
  `HERO_ID` bigint(20) DEFAULT NULL,
  `SPECIES_ID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `SEQUENCE`
--

CREATE TABLE `SEQUENCE` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- A tábla adatainak kiíratása `SEQUENCE`
--

INSERT INTO `SEQUENCE` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', '0');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `species`
--

CREATE TABLE `species` (
  `ID` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `stock`
--

CREATE TABLE `stock` (
  `ID` bigint(20) NOT NULL,
  `COUNT` int(11) DEFAULT NULL,
  `ASSET_ID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `user`
--

CREATE TABLE `user` (
  `ID` bigint(20) NOT NULL,
  `ADMIN` tinyint(1) DEFAULT '0',
  `HERO` longblob,
  `NAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- A tábla adatainak kiíratása `users`
--

INSERT INTO `users` (`id`, `name`, `password`, `role`) VALUES
(1, 'qw', '006d2143154327a64d86a264aea225f3', 'USER'),
(2, 'qwww', 'wwww', ''),
(3, 'sss', 'ssss', ''),
(4, 'rrr', 'rrrrrrr', ''),
(5, 'aarr', 'd', '');

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `asset`
--
ALTER TABLE `asset`
  ADD PRIMARY KEY (`ID`);

--
-- A tábla indexei `building`
--
ALTER TABLE `building`
  ADD PRIMARY KEY (`ID`);

--
-- A tábla indexei `empire`
--
ALTER TABLE `empire`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_empire_USER_ID` (`USER_ID`);

--
-- A tábla indexei `empire_building`
--
ALTER TABLE `empire_building`
  ADD PRIMARY KEY (`Empire_ID`,`buildings_ID`),
  ADD KEY `FK_empire_building_buildings_ID` (`buildings_ID`);

--
-- A tábla indexei `empire_stock`
--
ALTER TABLE `empire_stock`
  ADD PRIMARY KEY (`Empire_ID`,`stocks_ID`),
  ADD KEY `FK_empire_stock_stocks_ID` (`stocks_ID`);

--
-- A tábla indexei `hero`
--
ALTER TABLE `hero`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_hero_USER_id` (`USER_id`);

--
-- A tábla indexei `hero_hybrid`
--
ALTER TABLE `hero_hybrid`
  ADD PRIMARY KEY (`Hero_ID`,`hybrids_ID`);

--
-- A tábla indexei `hybrid`
--
ALTER TABLE `hybrid`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_hybrid_SPECIES_ID` (`SPECIES_ID`);

--
-- A tábla indexei `SEQUENCE`
--
ALTER TABLE `SEQUENCE`
  ADD PRIMARY KEY (`SEQ_NAME`);

--
-- A tábla indexei `species`
--
ALTER TABLE `species`
  ADD PRIMARY KEY (`ID`);

--
-- A tábla indexei `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_stock_ASSET_ID` (`ASSET_ID`);

--
-- A tábla indexei `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- A tábla indexei `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `hero`
--
ALTER TABLE `hero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT a táblához `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `empire`
--
ALTER TABLE `empire`
  ADD CONSTRAINT `FK_empire_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`ID`);

--
-- Megkötések a táblához `empire_building`
--
ALTER TABLE `empire_building`
  ADD CONSTRAINT `FK_empire_building_Empire_ID` FOREIGN KEY (`Empire_ID`) REFERENCES `empire` (`ID`),
  ADD CONSTRAINT `FK_empire_building_buildings_ID` FOREIGN KEY (`buildings_ID`) REFERENCES `building` (`ID`);

--
-- Megkötések a táblához `empire_stock`
--
ALTER TABLE `empire_stock`
  ADD CONSTRAINT `FK_empire_stock_Empire_ID` FOREIGN KEY (`Empire_ID`) REFERENCES `empire` (`ID`),
  ADD CONSTRAINT `FK_empire_stock_stocks_ID` FOREIGN KEY (`stocks_ID`) REFERENCES `stock` (`ID`);

--
-- Megkötések a táblához `hero`
--
ALTER TABLE `hero`
  ADD CONSTRAINT `FK_hero_USER_id` FOREIGN KEY (`USER_id`) REFERENCES `users` (`id`);

--
-- Megkötések a táblához `hybrid`
--
ALTER TABLE `hybrid`
  ADD CONSTRAINT `FK_hybrid_SPECIES_ID` FOREIGN KEY (`SPECIES_ID`) REFERENCES `species` (`ID`);

--
-- Megkötések a táblához `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `FK_stock_ASSET_ID` FOREIGN KEY (`ASSET_ID`) REFERENCES `asset` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
