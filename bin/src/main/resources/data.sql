-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.7.24 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5332
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping data for table election_db.activity: ~2 rows (approximately)
/*!40000 ALTER TABLE `activity` DISABLE KEYS */;
INSERT INTO `activity` (`id`, `end_date`, `name`, `start_date`, `type`, `created_at`, `updated_at`, `description`) VALUES
	(1, '2020-01-14 20:56:34', 'Activity1', '2020-01-14 20:56:36', 'Scientific', '2020-01-14 20:57:01', '2020-01-14 20:57:03', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmodtempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\nquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\nconsequat. Duis aute irure dolor'),
	(2, '2020-01-14 20:56:34', 'Activity 2', '2020-01-14 20:56:36', 'Scientific', '2020-01-14 20:57:01', '2020-01-14 20:57:03', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmodtempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\nquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\nconsequat. Duis aute irure dolor');
/*!40000 ALTER TABLE `activity` ENABLE KEYS */;

-- Dumping data for table election_db.candidate: ~4 rows (approximately)
/*!40000 ALTER TABLE `candidate` DISABLE KEYS */;
INSERT INTO `candidate` (`id`, `date_of_birth`, `email`, `facebook`, `firstname`, `image`, `lastname`, `twitter`, `created_at`, `updated_at`, `position`, `electoral_id`, `nb_rate`, `rate`) VALUES
	(2, '2020-01-13 19:42:45', 'test@email.com', 'fb.com/salahben', 'salaho', 'http://localhost://election\\uploads\\candidates\\81950339_2655467354540580_361606838682124288_n.jpg', 'brrrrr', 'twitter/saaa', '2020-01-14 10:49:03', '2020-01-14 10:49:05', 0, NULL, 0, 0),
	(4, '1993-05-19 23:00:00', 'ali@test.com', 'fb.com/salahben', 'Ali', 'http://localhost\\election\\uploads\\candidates\\1578990513483.jpg', 'Candidate', 'twitter/saaa', '2020-01-14 10:49:06', '2020-01-15 11:18:11', 1, 1, 2, 180),
	(5, '1993-01-21 23:00:00', 'Jihad@Doggaz.com', 'fb.com/esed.ded', 'Jihad', 'http://localhost\\election\\uploads\\candidates\\1578995393263.jpg', 'Doggaz', 'twitter/esed', '2020-01-14 09:49:53', '2020-01-14 09:50:29', 0, NULL, 0, 0),
	(6, '2020-01-13 23:00:00', 'candidate@email.com', 'asdasd', 'candidate', 'http://localhost/election/uploads\\candidates\\1579024563755.jpg', 'two', 'asdsadd', '2020-01-14 17:56:04', '2020-01-14 17:56:04', 0, NULL, 0, 0);
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;

-- Dumping data for table election_db.candidate_activities: ~3 rows (approximately)
/*!40000 ALTER TABLE `candidate_activities` DISABLE KEYS */;
INSERT INTO `candidate_activities` (`candidates_id`, `activities_id`) VALUES
	(2, 1),
	(4, 1),
	(4, 2);
/*!40000 ALTER TABLE `candidate_activities` ENABLE KEYS */;

-- Dumping data for table election_db.electoral: ~0 rows (approximately)
/*!40000 ALTER TABLE `electoral` DISABLE KEYS */;
INSERT INTO `electoral` (`id`, `created_at`, `updated_at`, `description`, `image`, `name`) VALUES
	(1, '2020-01-15 09:45:40', '2020-01-15 09:45:42', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmodtempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\nquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\nconsequat. Duis aute irure dolor', 'https://cdn.vox-cdn.com/uploads/chorus_image/image/65613211/microsoftedgenewlogo.5.jpg', 'List 1'),
	(2, '2020-01-15 09:45:40', '2020-01-15 09:45:42', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmodtempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\nquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\nconsequat. Duis aute irure dolor', 'https://i.pinimg.com/236x/33/b8/69/33b869f90619e81763dbf1fccc896d8d--lion-logo-modern-logo.jpg', 'List 2'),
	(3, '2020-01-15 09:45:40', '2020-01-15 09:45:42', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmodtempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\nquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\nconsequat. Duis aute irure dolor', 'https://i.pinimg.com/originals/67/ab/a1/67aba171f2f192fe07a351d784807749.jpg', 'List 3'),
	(4, '2020-01-15 09:45:40', '2020-01-15 09:45:42', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmodtempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\nquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\nconsequat. Duis aute irure dolor', 'https://wwwbenandcrowd.com/gallery/brands/pictures/picture14557389575829.jpg', 'List 4');
/*!40000 ALTER TABLE `electoral` ENABLE KEYS */;

-- Dumping data for table election_db.media_support: ~3 rows (approximately)
/*!40000 ALTER TABLE `media_support` DISABLE KEYS */;
INSERT INTO `media_support` (`id`, `name`, `type`, `url`, `activity_id`, `created_at`, `updated_at`) VALUES
	(1, 'Image 1', 'image', 'https://nanotempertech.com/wp-content/uploads/2019/04/Conferences-feat-img.png', 1, '2020-01-14 21:07:50', '2020-01-14 21:07:52'),
	(2, 'Image 2', 'image', 'https://pbs.twimg.com/media/DfAFtHvU0AAQaUU.jpg', 2, '2020-01-14 21:07:50', '2020-01-14 21:07:52'),
	(3, 'Sci.Event', 'image', 'https://cdn.worldsciencefestival.com/wp-content/uploads/2013/11/043015-JB-689A9330-2-copy-1.jpg', 1, '2020-01-14 23:43:36', '2020-01-14 23:43:37');
/*!40000 ALTER TABLE `media_support` ENABLE KEYS */;

-- Dumping data for table election_db.user: ~1 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `email`, `firstname`, `lastname`, `login`, `password`, `role`, `created_at`, `updated_at`) VALUES
	(4, 'salah@email.com', 'salah', 'br', 'salaho', '$2a$10$PJKzv6WynecfhQQYkXEg2OfMjOBzwmN3dW/U7ZFNOW04bjrajCOZW', 'Client', '2020-01-15 11:22:53', '2020-01-15 11:22:54');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
